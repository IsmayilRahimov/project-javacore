package org.example.projectjavacore.designpatterns;

public class SingleProPat {
    // klas daxilinde ozunun static obyektini saxlayiriq
    private static SingleProPat instance;

    private SingleProPat() {  // private constructor = basga yerden yeni obyekt yaradila bilmesin
    }

    //  Klassın obyekti yalnız bu metod vasitəsilə əldə olunur
    public static synchronized SingleProPat getInstance() { //
        if (instance == null) {
            instance = new SingleProPat();
        }
        return instance;  // eks halda  movcud obyekti qaytar
    }

    public void show() {
        System.out.println("SingleProPat show");
    }

    public static void main(String[] args) {
        SingleProPat s1 = SingleProPat.getInstance();
        SingleProPat s2 = SingleProPat.getInstance();
        s1.show();

        System.out.println(s1 == s2);
    }
}
