package org.example.projectjavacore.pattern;

public class SingleMany {
    private static SingleMany instance;

    private SingleMany() {  // private constructor = basga yerden yeni obyekt yaradila bilmesin
    }

    //  Klassın obyekti yalnız bu metod vasitəsilə əldə olunur
    public static synchronized SingleMany getInstance() { //
        if (instance == null) {
            instance = new SingleMany();
        }
        return instance;  // eks halda  movcud obyekti qaytar
    }

    public void show() {
        System.out.println("SingleProPat show");
    }

}
