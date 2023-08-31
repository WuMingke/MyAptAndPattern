package com.erkuai.lib_processor


@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD)
annotation class BindView(val id: Int)


// TODO: 2023/1/8 这里应该把所有注解单独放在一个库里，让 注解处理器库 和 主项目，都依赖它，就不用单独在这里写了