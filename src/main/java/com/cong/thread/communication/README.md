并发编程中的两个关键问题
1.线程之间如何通信
    <br/>
    a)共享内存 -- 隐式通信
    <br/>   
    b)消息传递 -- 显示通信
<br/>
2.线程之间如何同步
    在共享内存的并发模型中,同步时显示做的:synchronized
    在消息传递的并发模型中,由于消息的发送必须在消息接收之前,所以同步是隐式
    
    
    
    实例域 静态域 数组元素  都是在堆内存中  堆内存线程共享
        局部变量 方法定义参数 异常处理 没有可见性问题
    
    
 