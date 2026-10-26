public class Theatre {

    public static void main(String[] args) {

        System.out.println(" ТЕАТР ОТКРЫВАЕТ ДВЕРИ! ");
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Анна", "Петрова", Gender.FEMALE, 165);
        Actor actor3 = new Actor("Сергей", "Сидоров", Gender.MALE, 175);

        Director director1 = new Director("Андрей", "Андреев", Gender.MALE,15);
        Director director2 = new Director("Елена", "Еленова", Gender.FEMALE,20);

        String musicAuthor = "Пётр Ильич Чайковский";
        String choreographer = "Мариус Петипа";

        Show regularShow = new Show("Драма жизни", 120, director1);
        Opera operaShow = new Opera( "Кармен", 140, director2, musicAuthor,
                "Страстная история любви и ревности", 40 );
        Ballet balletShow = new Ballet( "Лебединое озеро", 150, director1, musicAuthor,
                "История о заколдованных лебедях", choreographer );

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

        Actor fakeActor = new Actor("Фантом", "Фантомов", Gender.MALE, 190);
        boolean removed = operaShow.getListOfActors().remove(fakeActor);

        if (!removed) {
            System.out.println("⚠️ Не удалось удалить: актёра 'Фантом Фантомов' нет в составе 'Кармен'. Список не изменился.");
        } else {
            System.out.println("✅ Актёр 'Фантом Фантомов' успешно удалён (это странно, проверь логику!).");
        }
        System.out.println();

        System.out.println("📜 ТЕКСТЫ ЛИБРЕТТО:");
        System.out.println("- Опера '" + operaShow.getTitle() + "': " + operaShow.getLibrettoText());
        System.out.println("- Балет '" + balletShow.getTitle() + "': " + balletShow.getLibrettoText());

        System.out.println("\n🎭 ТЕАТР ЗАКРЫВАЕТ ДВЕРИ. СПАСИБО ЗА ПРОСМОТР! 🎭");
    }

    private static void printCast(String title, Show show) {
        System.out.println("--- " + title + " ---");

        // Получаем список актёров
        var actors = show.getListOfActors();

        if (actors.isEmpty()) {
            System.out.println("  (В составе пока никого нет)");
        } else {
            for (Actor actor : actors) {
                System.out.println("- " + actor.getName() + " " + actor.getSurname() +
                        " (Рост: " + actor.getHeight() + " см)");
            }
        }
        System.out.println();
    }
}

