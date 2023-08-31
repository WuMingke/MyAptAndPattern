注解处理器、泛型

1、通过反射的方式实现ButterKnife
    多次反射消耗性能

ButterKnife是依赖注入吗？不是。
    依赖注入：所需要的数据来自外部类，不关心数据获取的方式

2、apt实现ButterKnife


Pattern.kt


Android的构建流程：
    apk文件的数据：
        dex：源代码
        res：与原始文件对比，id会变成具体的值，wrap_content会变成-2 等等
        AndroidManifest：与原始文件对比，会添加一些数据，比如versionCode、versionName

    执行gradle就是执行一个个的task
        找task的源码->在 plugin 'com.android.application' 中，
        通过 classpath 'com.android.tools.build:gradle:7.1.0-alpha03' 依赖进来的，
        要查看的话，可以在 dependencies 里添加 compileOnly '上面的路径' 来依赖进来看

        eg:AppPlugin

        SdkHandler 将源码和Framework源码相关联
        configureExtension()方法，读取build.gradle里面的节点的配置信息，比如 android { }
        createTaskManager：创建Task

        每个变体都有自己完整的一套Task

        createAndroidTasks() 方法
        createTaskForVariantScope()方法
        createPostCompilationTasks()方法 将源码转换成dex文件

    BuildConfig-Task 解析
        createBuildConfigTask() 方法
    AIDL-Task 解析

    MergeResources 解析

    手动打包：





