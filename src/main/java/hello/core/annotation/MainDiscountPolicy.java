package hello.core.annotation;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME) // 어디에 사용 가능한 빈인지
@Inherited // 상속 가능한지
@Documented // 문서화 할지
@Qualifier("mainDiscountPolicy") // 어떤 이름의 빈이 될지
public @interface MainDiscountPolicy {
}
