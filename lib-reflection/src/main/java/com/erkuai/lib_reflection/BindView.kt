package com.erkuai.lib_reflection


@Retention(AnnotationRetention.RUNTIME) // 保留到哪个时候
@Target(AnnotationTarget.FIELD) // 注解用在谁身上
annotation class BindView(val id: Int)
