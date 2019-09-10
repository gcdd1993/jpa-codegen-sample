package me.itlearner.jpacodegen.sample;

import io.github.gcdd1993.jpa.codegen.CodeGenerator;
import org.junit.Test;

/**
 * CRUD代码生成器
 *
 * @author gaochen
 * @date 2019/6/22
 */
public class Codegen {

    @Test
    public void generate() {
        new CodeGenerator("src/test/resources/codegen.properties")
                .packInclude("me.itlearner.jpacodegen.sample.entity")
                .registerRender("form")
                .registerRender("repository")
                .registerRender("service")
                .registerRender("controller")
                .generate();
    }
}
