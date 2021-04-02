package obj;

public class BoxingUboxing {

    public static void main(String[] args) {

        FruitBox<Orange> orBox = new FruitBox<Orange>(new Orange(10));
        Orange org = orBox.pullOut();
        org.showSugarContent();

        FruitBox<Apple> apBox = new FruitBox<Apple>(new Apple(20));
        Apple app = apBox.pullOut();
        app.showSugarContent();



    }
}

class Orange
{

    int sugaContent;
    public Orange(int sugar){sugaContent = sugar;}

    public void showSugarContent()
    {
        System.out.println("당도 :"+sugaContent);
    }

}

class Apple {
    int weight;

    public Apple(int weight) { this.weight = weight; }

    public void showSugarContent()
    {
        System.out.println("무게 :"+weight);
    }

}

class FruitBox<T>
{

    T iteam;
    public FruitBox(T obj) {this.iteam = obj;}

    public void store(T iteam) {this.iteam = iteam;}
    public T pullOut() {return iteam;}


}












