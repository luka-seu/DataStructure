# Java 面试题 #
## java 基础 ##


- **为什么重写equals要重写hashcode方法**？
	
> 重写hashcode方法是为了满足当两个对象的equals方法相等时，其hashcode方法也必然相等这一约定。重写equals方法用于比较的字段，在hashcode方法中也应该有体现。[https://www.cnblogs.com/ouym/p/8963219.html](https://www.cnblogs.com/ouym/p/8963219.html "hashcode&equals")



- **说一下map的分类和常见的情况**
> map接口下总共有4个实现类：HashMap，HashTable，LinkedHashMap和TreeMap。map集合用于存储键值对，通过键获取值。HashMap是最常用的map，是一种基于数组和链表的实现形式。当然在JDK8之后引入了红黑树。由于HashMap是线程不安全的，在并发环境可能会出现线程安全问题。因而JDK提供了HashTable，其是线程安全的，同时HashTable不支持键值的null，但是HashMap支持。由于HashTable是线程安全的，其在同步时的开销也是巨大的。对此，从JDK1.5之后，提供了ConcurrentHashMap，用于并发编程下的map集合。其利用分段加锁的机制，使得同步的开销降低。TreeMap是一种排序的集合，基于键值的排序，因此若键是对象类型，则需要实现comparable接口。其底层为红黑树。


- **对象若不重写hashCode()的话，hashCode()如何计算出来的？**
> hashcode方法直接返回对象的内存地址





- **==比较的是什么?**
> 若不重写equals方法，比较的对象的地址，重写equals的话，按照equals方法比较的内容比较。

- **java8新特性**
> Lambda表达式，流式处理，新的时间api

- **什么是值传递和引用传递**
> 值传递：传递的实际参数的一个副本，这个参数可能是基本类型的值，也可能是引用对象的地址

>引用传递：传递的是引用变量的地址的副本。在java中只存在值传递。

- **&和&&的区别**
> 都表示逻辑与，不同在于&&支持短路功能，即若第一个表示为false则第二个表达式不会再去判断。

## 并发编程 ##

- **介绍一下Syncronized锁，如果用这个关键字修饰一个静态方法，锁住了什么？如果修饰成员方法，锁住了什么？**
> Syncronized用来实现线程安全的原子性和可见性，是在jvm层面的对线程安全的一种处理。被Syncronized修饰的方法或代码块在同一时间只允许一个线程访问，只有线程释放锁，另一个线程得到锁才能访问。

> 修饰静态方法，锁的是这个当前类的所有对象；修饰成员方法，锁住的是当前对象。

- **介绍一下volatile**
> volatile可以用来保证线程安全中的可见性和有序性。可见性是指，某一线程对volatile修饰的变量的操作对其他线程是可见的。在这里，volatile修饰的变量，会强制被写入到主内存中去，而不是在工作内存中；同时读的时候也是强制从主内存中读取，保证不同线程所获的是同一个变量值。实现原理主要是通过内存屏障实现（读：store；写：load）。

> 有序性是针对程序运行时的指令重排序。举个例子，在new一个java对象时，经历了三个过程：
1. 为对象分配内存；
2. 将对象进行相应的初始化；
3. 将分配的内存指向当前对象。但是上述的第2步和第3步可能会出现指令重排序，这样当另一个线程在第2步就可能拿到内存中的对象，但是时没有初始化的。在使用的时候就会存在问题。

- **Synchronized和lock**
>
1. synchronized和lock都是互斥锁和重量级锁。都用于线程间的同步。
2. synchronized时基于JVM层面的锁，也就是锁的释放不用程序员关心。交由JVM管理。而Lock是基于JDK层面的锁，锁的释放必须在finally块中释放。
3. Lock支持公平锁，也就是支持最先等待的最先获得锁。在构造方法中声明。
4. Lock支持锁的可中断，也就是可以指定等待时间，如果没有获得锁，就不再等待。降低同步的开销。
5. Lock支持有条件的获得和释放锁，利用Condition手动完成线程之间的同步。


- **AQS**
> AQS,也就是同步队列，是JUC下很重要的一个组件，它提供了很多我们平时在并发编程中的常用组件。AQS内部维护了一个FIFO的双端链表，也就是队列。同时内部拥有一个state的字段用来表示当前共享资源被锁定的状态。当state为0时，表示当前资源没有被锁定，线程可以获取。如果等于1，表示资源被锁定，没有获得锁的线程将会被放在队列尾部等待。而队列头部表示获得当前锁的线程，当其释放锁的时候会通知其后继节点该锁已经释放，可以获取。当同一个线程重入获取锁的时候，state就会加1。


## 数据库 ##

- **数据库的索引**
> 数据库的索引主要有hash和b树两种结构，hash索引主要是利用散列表，比较适合等值查询。而更被广泛应用的是b树索引。数据库的索引主要是B+树，相比于传统的b树，B+树的数据全部存储在叶子节点，非叶子节点只储存指向子节点的指针，这样可以大大减少存储空间；同时所有数据存储在叶子节点意味着每次查询数据的时候从根节点到叶子节点的路径长度差不多，查询更加稳定；最为重要的是，叶子节点之间也维护者指向下一个叶子节点的指针，意味着范围查询更加容易。

- **数据库的事务特性**


> ACID：原子性，持久性，一致性和隔离性。

> 原子性：事务要么全部成功，要么全部失败；
> 
> 持久性：事务的提交对数据改变时持久化的；
> 
> 一致性：事务在提交前后数据的数据一致的，也就是数据库从一个一致性状态转换到另一个一致性状态；
> 
> 隔离性：一个事务不能被其他事务所干扰。


- **数据库的事务特性是如何实现的**

> 事务的特性主要靠redo log，undo log以及MVCC控制的。其中 redo log主要用来实现持久性和一致性，数据库中对数据的更改并不会立即是写入磁盘中，而是先写入到redo log中，在写入redo log过程中，会先写入到log的缓冲区当中。在每次事务提交之前，确保redo log缓冲区的log都持久化到redo log之中。这样如果数据库突然崩溃，则下次数据库启动时就是从redo log中恢复数据，当然只会恢复到上次事务提交的状态。而原子性和隔离性主要靠undo log和MVCC控制。undo log是为了保证数据库事务的原子性的，每次对数据库的修改操作之前，数据库会将原先的数据备份到undo log之中，这样当数据需要回滚时，从undo log回滚即可。MVCC叫多版本并发控制，实际上是乐观锁的一种体现，当一个事务拿到一行数据锁的时候，先把原始数据复制一份到undo log，这样其他事务在执行只读操作时，无需同步。[https://www.cnblogs.com/davygeek/p/7995072.html](https://www.cnblogs.com/davygeek/p/7995072.html "数据库的事务实现")

## JavaWeb ##
- **servlet的生命周期**
> 首先调用servlet的init()方法，完成初始化，然后调用service()方法，执行相关请求并返回响应；最后调用destroy()方法执行servlet的销毁。

- **PrepareStatement的原理和用法**
> 相较于Statement，PrepareStatement利用占位符和方法调用为sql中的动态变量实现赋值，使得代码阅读更加清晰；同时，PrepareStatement支持sql的预编译，也就是下一次如果再次执行相同的语句，无需再编译，只需要将相应的参数替换即可；最后，PrepareStatement可以有效防止sql注入，由于采用了预编译的形式，下一次的无论如 or'1=1'这样的语句和时数据都会被认为是参数，从而不会产生sql注入。





