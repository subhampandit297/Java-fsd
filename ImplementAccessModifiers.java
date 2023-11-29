package com;


class ImplementAccessModifiers {
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    public static void main(String[] args) {
        ImplementAccessModifiers example = new ImplementAccessModifiers();
        example.publicMethod();
        example.privateMethod(); 
        example.protectedMethod();
    }
}


