package me.itlearner.jpacodegen.sample.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSampleUser is a Querydsl query type for SampleUser
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSampleUser extends EntityPathBase<SampleUser> {

    private static final long serialVersionUID = -592287708L;

    public static final QSampleUser sampleUser = new QSampleUser("sampleUser");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath password = createString("password");

    public final StringPath username = createString("username");

    public QSampleUser(String variable) {
        super(SampleUser.class, forVariable(variable));
    }

    public QSampleUser(Path<? extends SampleUser> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSampleUser(PathMetadata metadata) {
        super(SampleUser.class, metadata);
    }

}

