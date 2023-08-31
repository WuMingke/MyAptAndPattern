package com.erkuai.lib_processor;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import java.io.IOException;
import java.util.Collections;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;

//@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class BindingProcessor2 extends AbstractProcessor {

    Filer filer;
    String packageName = "com.erkuai.myaptandpattern";

    @Override
    public synchronized void init(ProcessingEnvironment processingEnvironment) {
        super.init(processingEnvironment);
        System.out.println("00000000001000000");

        filer = processingEnvironment.getFiler();

    }

    // TODO: 2023/8/31 process 不执行？？？
    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        System.out.println("111111111111111111111111111");
//        ClassName className = ClassName.get(packageName, "MainActivityBinding");
//        TypeSpec buildClass = TypeSpec.classBuilder(className)
//                .addModifiers(Modifier.PUBLIC)
//                .addMethod(MethodSpec.constructorBuilder()
//                        .addModifiers(Modifier.PUBLIC)
//                        .addParameter(ClassName.get(packageName, "MainActivity"), "activity")
//                        .addStatement("activity.textView = activity.findViewById(R.id.textView)") // 这里不应该是 R.xxx,应该是对应的数值，不然没有倒包也会报错
//                        .build())
//                .build();
//        try {
//            JavaFile.builder("", buildClass)
//                    .build()
//                    .writeTo(filer);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        return true;
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        System.out.println("1111111111222222211111111111111111");

        return Collections.singleton(BindingView.class.getCanonicalName());
    }
}










