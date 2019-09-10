package me.itlearner.jpacodegen.sample.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;

/**
 * @author jiaoew
 * @date 2017/4/14
 */
public abstract class BaseController {

    public ResponseEntity<?> ok() {
        return ResponseEntity.ok().build();
    }

    public <T> ResponseEntity<?> ok(T t, String fields) {
        return ResponseEntity.ok(t);
    }

    public <T> ResponseEntity<?> ok(T t) {
        return ResponseEntity.ok(t);
    }

    public ResponseEntity<?> notFound() {
        return ResponseEntity.notFound().build();
    }

    public ResponseEntity<MappingJacksonValue> ok(MappingJacksonValue t) {
        return ResponseEntity.ok(t);
    }

    public ResponseEntity<?> created() {
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    public <T> ResponseEntity<?> created(T t) {
        return ResponseEntity.status(HttpStatus.CREATED).body(t);
    }

    public <T> ResponseEntity<?> createdOriginal(T t) {
        return ResponseEntity.status(HttpStatus.CREATED).body(t);
    }

    public ResponseEntity<?> deleted() {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    public ResponseEntity<?> badRequest() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

}
