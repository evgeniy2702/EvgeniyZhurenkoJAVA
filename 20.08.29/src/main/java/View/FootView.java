package View;

import Controller.FootController;
import Model.Builder.*;
import Model.FootManufacture;
import Model.FootWearBuilder;

import java.util.Scanner;

public class FootView {

    FootWearBuilder foot;
    FootManufacture footManufacture;
    FootController footController = new FootController();

    // Конструтор, который запускает сразу же метод запуска приложения при создании объекта
    // данного класса

    public FootView() throws InterruptedException {
        startEnd();
    }

    // Создаем объект класса сканер для использования дальше в методах данного класса

    Scanner scanner() {
        return new Scanner(System.in);
    }

    //Метод возвращает созданный объект класса FootWearBuilder

    public FootWearBuilder getFoot() {
        return foot;
    }

    //Старт приложения, где необходимо задать путь выполнения приложением программы
    //через выбор варинтов ее выполнения

    public void startEnd() throws InterruptedException {
        while (true) {
            System.out.println("Запускаем производство :\n1. ДА\n2. НЕТ\n3. Посмотреть остатки по складу");
            Scanner scanner = scanner();
            if (scanner.hasNextInt()) {
                int answer = scanner.nextInt();
                if (answer >= 1 && answer <= 3) {
                    switch (answer) {
                        case 1:
                            foot = createFootModel();
                            stock(done(foot.getPrice()));
                            startEnd();
                        case 2:
                            break;
                        case 3:
                            footController.getAllFootStock();
                            startEnd();
                    }
                    break;
                } else {
                    System.out.println("Сделайте повторный выбор");
                }

                    }
                }
            }

            // Метод, который отвечает за выбор типа обуви Мужская или Женская

    public Type choiceType() throws InterruptedException {
        while (true) {
            System.out.println("Какую обувь делаем :\n1. Мужская\n2. Женская\n3. Вернуться к предыдущему меню");
            Scanner scanner = scanner();
            if (scanner.hasNextInt()) {
                int answer = scanner.nextInt();
                if (answer >= 1 && answer <= 3) {
                    Type[] type = Type.values();
                    if (answer != 3) {
                        System.out.println("Вы выбрали " + type[answer - 1].getString());
                        return type[answer - 1];
                    } else {
                        System.out.println("Возврат к предыдущему меню");
                        startEnd();
                    }
                } else {
                    System.out.println("Сделайте повторный выбор");
                }

            }
        }
    }

    //Метод, который отвечает за выбор вида обуви

    public View choiceView() throws InterruptedException {
        while (true) {
            System.out.println("Какую обувь делаем :\n1. Кросовки\n2. Сапоги\n3. Сандали\n4. Туфли\n5. Вернуться к предыдущему меню");
            Scanner scanner = scanner();
            if (scanner.hasNextInt()) {
                int answer = scanner.nextInt();
                if (answer >= 1 && answer <= 5) {
                    View[] view = View.values();
                    if (answer != 5) {
                        System.out.println("Вы выбрали " + view[answer - 1].getString());
                        return view[answer - 1];
                    } else {
                        System.out.println("Возврат к предыдущему меню");
                        choiceType();
                    }
                } else {
                    System.out.println("Сделайте повторный выбор");
                }

            }
        }
    }

    //Метод, который отвечает за выбор цвета обуви

    public Color choiceColor() throws InterruptedException {
        while (true) {
            System.out.println("Выбирите цвет обуви :\n1. Красный\n2. Черый\n3. Серый\n4. Сининй\n5. Вернуться к предыдущему меню");
            Scanner scanner = scanner();
            if (scanner.hasNextInt()) {
                int answer = scanner.nextInt();
                if (answer >= 1 && answer <= 5) {
                    Color[] color = Color.values();
                    if (answer != 5) {
                        System.out.println("Вы выбрали " + color[answer - 1].getString());
                        return color[answer - 1];
                    } else {
                        System.out.println("Возврат к предыдущему меню");
                        choiceView();
                    }
                } else {
                    System.out.println("Сделайте повторный выбор");
                }
            }
        }
    }

    //Метод, который отвечает за выбор размера обуви

    public Size choiceSize() throws InterruptedException {
        while (true) {
            System.out.println("Выбирите размер обуви :\n1. 34\n2. 36\n3. 38\n4. 40\n5. 42\n6. 44\n7. 46\n8. Вернуться к предыдущему меню");
            Scanner scanner = scanner();
            if (scanner.hasNextInt()) {
                int answer = scanner.nextInt();
                if (answer >= 1 && answer <= 8) {
                    Size[] sizes = Size.values();
                    if (answer != 8) {
                        System.out.println("Вы выбрали " + sizes[answer - 1].getString());
                        return sizes[answer - 1];
                    } else {
                        System.out.println("Возврат к предыдущему меню");
                        choiceColor();
                    }
                } else {
                    System.out.println("Сделайте повторный выбор");
                }
            }
        }
    }

    //Метод, который отвечает за выбор производителя, на площадях которого
    //планируется производить обувь заданной модели

    public Manufacture choiceManufacture() throws InterruptedException {
        while (true) {
            System.out.println("Выбирите производителя :\n1. производитель_1\n2. производитель_2\n3. производитель_3\n4. Вернуться к предыдущему меню");
            Scanner scanner = scanner();
            if (scanner.hasNextInt()) {
                int answer = scanner.nextInt();
                if (answer >= 1 && answer <= 4) {
                    Manufacture[] manufactures = Manufacture.values();
                    if (answer != 4) {
                        System.out.println("Вы выбрали " + manufactures[answer - 1].getString());
                        return manufactures[answer - 1];
                    } else {
                        System.out.println("Возврат к предыдущему меню");
                        choiceColor();
                    }
                } else {
                    System.out.println("Сделайте повторный выбор");
                }
            }
        }
    }

    //Метод расчета стоимости модели обуви, учитывая все ее параметры и производителя

    public double getPriceFoot() throws InterruptedException {
        while (true) {
            System.out.println("Создаем модель обуви:\n1. ДА\n2. НЕТ\n3. Вернуться к предыдущему меню");
            Scanner scanner = scanner();
            if (scanner.hasNextInt()) {
                int answer = scanner.nextInt();
                if (answer >= 1 && answer <= 3) {
                    double price = 0;
                    Type type = foot.getType();
                    View view = foot.getView();
                    Color color = foot.getColor();
                    Size size = foot.getSize();
                    Manufacture manufacture = foot.getManufacturer();
                    if (answer != 3) {
                        if (type.equals(Type.MAN_TYPE)) {
                            price += 2;
                            for (int i = 0; i < View.values().length; i++) {
                                if (view == (View.values()[i])) {
                                    price += (i + 1);
                                }
                            }
                            for (int j = 0; j < Color.values().length; j++) {
                                if (color == Color.values()[j]) {
                                    price += (j + 2);
                                }
                            }
                            for (int y = 0; y < Size.values().length; y++) {
                                if (size == Size.values()[y]) {
                                    price += (y + 1);
                                }
                            }
                            for (int z = 0; z < Manufacture.values().length; z++) {
                                if (manufacture == Manufacture.values()[z]) {
                                    price += (z + 1);
                                }
                            }
                        } else {
                            price += 3;
                            for (int i = 0; i < View.values().length; i++) {
                                if (view == (View.values()[i])) {
                                    price += (i + 1);
                                }
                            }
                            for (int j = 0; j < Color.values().length; j++) {
                                if (color == Color.values()[j]) {
                                    price += (j + 2);
                                }
                            }
                            for (int y = 0; y < Size.values().length; y++) {
                                if (size == Size.values()[y]) {
                                    price += (y + 1);
                                }
                            }
                            for (int z = 0; z < Manufacture.values().length; z++) {
                                if (manufacture == Manufacture.values()[z]) {
                                    price += (z + 1);
                                }
                            }
                        }
                        System.out.println("Цена изделия получилась " + price + " грн");
                        return price;
                    } else {
                        System.out.println("Возврат к предыдущему меню");
                        choiceColor();
                    }
                } else {
                    System.out.println("Сделайте повторный выбор");
                }
            }
        }
    }

    // Метод, который отвечает за выбор проивзодить или нет заданную модель обуви по расчитанной цене

    public FootManufacture done(double price) throws InterruptedException {
        while (true) {
            System.out.println("Создаем модель обуви по расчетной цене " + price + "\n1. ДА\n2. НЕТ");
            Scanner scanner = scanner();
            if (scanner.hasNextInt()) {
                int answer = scanner.nextInt();
                if (answer == 1) {
                    System.out.println("Задайте колличество производимой партии");
                    if (scanner.hasNextInt()) {
                        int numbers = scanner.nextInt();
                        footManufacture = new FootManufacture();
                        //foot = createFootModel();
                        footManufacture.produceFootwear(foot, numbers);
                        System.out.println("Партия обуви " + foot.toString() + " произведена в колличестве " + numbers + " шт");
                        return footManufacture;
                    } else {
                        System.out.println("Сделайте повторный выбор");
                        done(price);
                    }
                } else if (answer == 2) {
                    getPriceFoot();
                } else {
                    System.out.println("Сделайте повторный выбор");
                    done(price);
                }
            }
        }
    }

    //Метод создания модели обуви по ранее определенным параметрам

    public FootWearBuilder createFootModel() throws InterruptedException {
        foot = new FootWearBuilder();
        foot.setType(choiceType());
        foot.setView(choiceView());
        foot.setColor(choiceColor());
        foot.setSize(choiceSize());
        foot.setManufacturer(choiceManufacture());
        foot.setPrice(getPriceFoot());
        return foot;
    }

    //Метод имитации ОТК приема партии обуви на склад

    public boolean OTK() {
        while (true) {
            System.out.println("Отгружаем партию обуви " + getFoot() + " на склад ?\n1. ДА\n2. НЕТ");
            Scanner scanner = scanner();
            if (scanner.hasNextInt()) {
                int answer = scanner.nextInt();
                if (answer >= 1 && answer <= 2) {
                    switch (answer) {
                        case 1:
                            return true;
                        case 2:
                            return false;
                    }
                } else {
                    System.out.println("Сделайте повторный выбор");
                }
            }
        }
    }

    //Метод записи произведенной партии обуви на склад производства после прохождения ОТК

    public void stock(FootManufacture footManufacture) {
        if (OTK()) {
            footController.addToStock(footManufacture);
        } else {
            footManufacture.foots = null;
        }
    }
}