package interfete;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Retention(RetentionPolicy.RUNTIME)
@Tag("Fast")
@Test
public @interface FastTest {

}
