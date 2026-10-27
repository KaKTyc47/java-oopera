public class Theatre {

    public static void main(String[] args) {

        System.out.println(" ТЕАТР ОТКРЫВАЕТ ДВЕРИ! ");
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Анна", "Петрова", Gender.FEMALE, 165);
        Actor actor3 = new Actor("Сергей", "Сидоров", Gender.MALE, 175);

        Director director1 = new Director("Андрей", "Андреев", Gender.MALE,15);
        Director director2 = new Director("Елена", "Еленова", Gender.FEMALE,20);

        String musicAuthor = "Пётр Ильич Чайковский";
        Person petipa = new Person("Мариус", "Петипа", Gender.MALE);

        Show regularShow = new Show("Драма жизни", 120, director1);
        Opera operaShow = new Opera(
                "Кармен",
                140,
                director2,
                musicAuthor,
                "Страстная история любви и ревности",
                40
        );
        Ballet balletShow = new Ballet(
                "Лебединое озеро",
                150,
                director1,
                musicAuthor,
                "История о заколдованных лебедях",
                petipa
        );

        regularShow.addActor(actor1);
        regularShow.addActor(actor2);

        operaShow.addActor(actor2);
        operaShow.addActor(actor3);

        balletShow.addActor(actor1);
        balletShow.addActor(actor3);

        printCast("Обычный спектакль", regularShow);
        printCast("Опера", operaShow);
        printCast("Балет", balletShow);

        regularShow.getListOfActors().remove(actor2);
        regularShow.addActor(actor3);
        printCast("Обычный спектакль (после замены)", regularShow);

        System.out.println(" ТЕСТ: Попытка повторного добавления актёра...");


        regularShow.addActor(actor1);


        regularShow.addActor(actor1);


        System.out.println("Итого актёров в спектакле: " + regularShow.getListOfActors().size());

        System.out.println(" ТЕСТ 1: Обычная замена (уникальная фамилия)");
        printCast("Состав до замены", regularShow);
        regularShow.replaceActor(actor3, "Петрова");
        printCast("Состав после замены", regularShow);


        System.out.println(" ТЕСТ 2: Конфликт фамилий (два Иванова)");


        Actor actor4 = new Actor("Пётр", "Иванов", Gender.MALE, 178);


        regularShow.addActor(actor4);

        printCast("Состав перед конфликтом", regularShow);

        System.out.println("\n--- Попытка замены по фамилии 'Иванов' (должно сработать предупреждение) ---");

        regularShow.replaceActor(actor3, "Иванов");

        printCast("Состав после попытки (должен остаться без изменений)", regularShow);


        System.out.println("\n🎭 ТЕСТ 3: Актёр с несуществующей фамилией");
        regularShow.replaceActor(actor1, "НеизвестнаяФамилия");

        System.out.println("\n🎉 ВСЕ ТЕСТЫ ЗАВЕРШЕНЫ! 🎉");
        System.out.println("🎭 ТЕАТР ЗАКРЫВАЕТ ДВЕРИ. СПАСИБО ЗА ПРОСМОТР! 🎭");
    }

    private static void printCast(String title, Show show) {
        System.out.println("--- " + title + " ---");

        var actors = show.getListOfActors();

        if (actors.isEmpty()) {
            System.out.println("  (В составе пока никого нет)");
        } else {

            for (Actor actor : actors) {
                System.out.println("- " + actor);
            }
        }
        System.out.println();
    }
}

