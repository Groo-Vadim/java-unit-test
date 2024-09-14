@Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);

        // Проверка, что метод возвращает true, когда возраст больше 18
        assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
    }