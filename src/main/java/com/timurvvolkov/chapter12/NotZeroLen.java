package com.timurvvolkov.chapter12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
@interface NotZeroLen {
}
