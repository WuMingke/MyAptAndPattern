package com.erkuai.lib_processor

import java.util.Collections
import javax.annotation.processing.AbstractProcessor
import javax.annotation.processing.Filer
import javax.annotation.processing.ProcessingEnvironment
import javax.annotation.processing.RoundEnvironment
import javax.lang.model.element.TypeElement

class BindingProcessor : AbstractProcessor() {

    private var filer: Filer? = null

    override fun init(processingEnv: ProcessingEnvironment?) {
        super.init(processingEnv)

        filer = processingEnv?.filer
    }

    // 第一步，配置resources
    // 第二步，重写方法
    override fun process(annotations: MutableSet<out TypeElement>?, roundEnv: RoundEnvironment?): Boolean {
        // 这里需要JavaPoet（KotlinPoet），来生成 类文件
        return false
    }

    override fun getSupportedAnnotationTypes(): MutableSet<String> {
        return Collections.singleton(BindView::class.java.canonicalName)
    }

}