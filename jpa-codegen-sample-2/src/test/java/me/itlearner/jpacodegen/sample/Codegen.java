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
                .packInclude("me.itlearner.jpacodegen.sample.entity") // 批量加入生成的实体类包名
                // .clazzInclude(me.itlearner.jpacodegen.sample.entity.SampleUser.class) // 加入生成的实体类名
                // .clazzExlude(me.itlearner.jpacodegen.sample.entity.SampleUser.class) // 排除生成的实体类名，通常与packInclude混用，以排除包下的特殊实体类不参与生成代码
                .registerRender("form")
                .registerRender("repository")
                .registerRender("service")
                .registerRender("controller")
                .generate();
    }
}
