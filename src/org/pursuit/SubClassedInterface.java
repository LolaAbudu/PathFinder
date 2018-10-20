package org.pursuit;

public class SubClassedInterface implements SomeInterface {
    @Override
    public void pleaseOverrideMe(){
        System.out.println("jbey");  // this is a method definition; when you fill up the method {}
    }
}
