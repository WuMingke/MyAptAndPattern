Gradle是一个运行在JVM的通用构建工具，其核心模型是一个Task组成的有向无环图.

增量编译（Incremental Build, 也叫做 Up-to-date checks）
    指的是: 在同一个项目中, 同一个 task 除非有必要, 否则不会被无意义地执行多次. 被跳过的 task 会显示 UP-TO-DATE.
    默认开启

缓存（Caching）
    指的是：无论是否在同一个项目(甚至是不同的机器), 只要 task 的输入没变, 就可以复用缓存的结果而不必真正执行 task.
    被 caching 跳过的 task 会显示 FROM-CACHE.
    默认关闭

增量编译和缓存都存在的情况下，优先使用增量编译。他们的目的是一样的，区别在于增量编译是项目级别的，只缓存上一次构建Task的结果；
Caching是全局(甚至跨设备)的，并且会保存所有构建Task的结果，Caching适合整个团队共享构建缓存。



