package com.ll.chat_ai.global.util;

import lombok.SneakyThrows;

public class Ut {
    public static class thread{
        @SneakyThrows
        public static void sleep(long millis){
            Thread.sleep(millis);
        }
    }
}
