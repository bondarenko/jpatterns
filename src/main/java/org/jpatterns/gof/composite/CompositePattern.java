package org.jpatterns.gof.composite;

import org.jpatterns.*;

import java.lang.annotation.*;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@Documented
@DesignPattern(type = Type.STRUCTURAL)
public @interface CompositePattern {
  CompositeRole role() default CompositeRole.COMPONENT;

  Class[] participants() default {};

  String comment() default "";
}