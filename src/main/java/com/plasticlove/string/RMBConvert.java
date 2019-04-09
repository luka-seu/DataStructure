package com.plasticlove.string;

/**
 * @author luka-seu
 * @description
 *
1、中文大写金额数字前应标明“人民币”字样。中文大写金额数字应用壹、贰、叁、肆、伍、陆、柒、捌、玖、拾、佰、仟、万、亿、元、角、分、零、整等字样填写。（30分） 

2、中文大写金额数字到“元”为止的，在“元”之后，应写“整字，如￥ 532.00应写成“人民币伍佰叁拾贰元整”。在”角“和”分“后面不写”整字。（30分） 

3、阿拉伯数字中间有“0”时，中文大写要写“零”字，阿拉伯数字中间连续有几个“0”时，中文大写金额中间只写一个“零”字，如￥6007.14，应写成“人民币陆仟零柒元壹角肆分“。（
 
输入描述:
输入一个double数

输出描述:
输出人民币格式

 * @create 2019/4/9-15:39
 */
public class RMBConvert {

    public static String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖","拾"};
    public static String convertRMB(double money){
        String moneyStr = String.valueOf(money);
        String zheng = moneyStr.substring(0,moneyStr.lastIndexOf("."));
        String xiao = moneyStr.substring(moneyStr.lastIndexOf(".")+1);
        int yi = Integer.valueOf(zheng)/100000000;
        int wan = (Integer.valueOf(zheng)%100000000)/10000;
        int ge = Integer.valueOf(zheng)/10000;
        int xiaoshu = Integer.valueOf(xiao);
        StringBuilder sb = new StringBuilder();
        System.out.print("人民币");
        if (yi != 0)
            sb.append(getUpper(yi) + "亿");
        if (wan != 0)
            sb.append(getUpper(wan) + "万");
        if (ge != 0)
            sb.append(getUpper(ge) + "元");
        if (xiaoshu == 0)
            sb.append("整");
        else
        {
            int jiao = xiaoshu / 10;
            int fen = xiaoshu % 10;
            if (fen == 0) {
                sb.append(arr[jiao] + "角");
            }
            else if (jiao == 0) {
                sb.append(arr[fen] + "分");
            }
            else {
                sb.append(arr[jiao] + "角" + arr[fen] + "分");
            }
        }
        return sb.toString();


    }
    public static String getUpper(int n)
    {
        StringBuffer sb = new StringBuffer();
        int qian = n / 1000;
        int bai = (n % 1000) / 100;
        int shi = (n % 100) / 10;
        int ge = n % 10;
        if (qian != 0)
            sb.append(arr[qian] + "仟");

        if (bai != 0)
            sb.append(arr[bai] + "佰");
        else if (qian != 0 && bai == 0 && (shi != 0 || ge != 0))
            sb.append("零");

        if (shi != 0 && shi != 1)
            sb.append(arr[shi] + "拾");
        else if (shi == 1)
            sb.append("拾");
        else if (bai!= 0 && ge != 0)
            sb.append("零");

        if (ge != 0)
            sb.append(arr[ge]);
        return sb.toString();
    }


}
