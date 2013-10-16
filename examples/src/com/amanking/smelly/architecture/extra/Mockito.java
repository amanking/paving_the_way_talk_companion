package com.amanking.smelly.architecture.extra;

public class Mockito {
    public static <T>T mock(Class<T> klass) {
        return null;
    }

    public static <T> When when(T object) {
        return new When();
    }

    public static class When {
        public void thenReturn(Object object) {

        }
    }
}
