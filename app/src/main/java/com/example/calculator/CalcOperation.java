package com.example.calculator;

public enum CalcOperation {
    EMPTY{
        @Override
        public String toString() {
            return "";
        }
    },
    PLUS{
        @Override
        public String toString() {
            return "+";
        }
    },
    MINUS{
        @Override
        public String toString() {
            return "-";
        }
    },
    DIVISION{
        @Override
        public String toString() {
            return "/";
        }
    },
    MULTIPLY{
        @Override
        public String toString() {
            return "*";
        }
    }
}
