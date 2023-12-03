package com.example.projectspring;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Getter
@Setter
@Component
@Scope
public class Person {

    public Person(){
        System.out.println("Person bean is created!");
    }
}

/*
1 уровень сложности: В этой домашке два уровня сложности, выполняйте второй уровень только, если первый уровень показался вам "легким" (создан по просьбам трудящихся)

Обычный уровень:
1) Создайте сущность Person, поставьте над ней аннотацию @Component и посмотрите, что при запуске спринг создает бин этого класса. (для этого можно создать пустой конструктор, и сделать в нем вывод текста на экран)


2) в main вытащите из контекста этого человека (то, что делали на уроке) 4 раза. Сколько раз напечатается сообщение из конструктора? Столько же объектов и создалось в программе


3) проделайте пункты 1 и 2 повторно, но укажите аннотацию @Scope("prototype") над классом person


4)Сколько раз напечатается сообщение из конструктора? Столько же объектов и создалось в программе


Кому скучно:
Бины в Spring можно создавать не только с помощью аннотаций, но и с помощью xml - https://www.baeldung.com/spring-boot-xml-beans


Прочитайте инструкцию и сделайте инициализацию бина через файл
 */
