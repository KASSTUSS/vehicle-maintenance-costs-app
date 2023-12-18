# Приложение учета затрат на содержание и обслуживание автомобиля
#### _Проект представляет собой веб-приложение для учета расходов на обслуживание автомобилей. В приложении реализованы два основных функционала: учет автомобилей и учет расходов, связанных с этими автомобилями. Проект использует Spring Boot и является веб-приложением с RESTful API для управления информацией об автомобилях и их расходах._
---
[SWAGGER](https://vehicle-maintenance-costs-app.onrender.com/swagger-ui/index.html)
[DEPLOY](https://vehicle-maintenance-costs-app-client.onrender.com/cars)


---


### Классы и компоненты:

1. **Controller (Контроллеры):**
 - `CarController`: Обрабатывает запросы, связанные с автомобилями, их созданием, обновлением и отображением.
 - `ExpenseController`: Отвечает за запросы, связанные с расходами, их созданием, обновлением и отображением.

2. **DTO (Data Transfer Objects):**
 - `CarDTO`: Объект для передачи данных о автомобиле между слоями приложения.
 - `CarExpensesDTO`: Объект для передачи данных о конкретном автомобиле и его расходах.
 - `ExpenseDTO`: Объект для передачи данных о расходе.

3. **Entity (Сущности):**
 - `CarEntity`: Сущность, представляющая автомобиль, сохраняемая в базе данных.
 - `ExpenseEntity`: Сущность, представляющая расход, сохраняемая в базе данных.

4. **Mapper (Мапперы):**
 - `CarMapper`: Отвечает за преобразование между CarEntity и CarDTO.
 - `ExpenseMapper`: Отвечает за преобразование между ExpenseEntity и ExpenseDTO.

5. **Repository (Репозитории):**
 - `CarRepository`: Интерфейс для работы с сущностью CarEntity.
 - `ExpenseRepository`:  Интерфейс для работы с сущностью ExpenseEntity.

6. **Service (Сервисы):**
 - `CarService`: Обрабатывает бизнес-логику, связанную с автомобилями.
 - `ExpenseService`: Обрабатывает бизнес-логику, связанную с расходами.

### Некоторые шаблоны проектирования, которые могут быть выделены в этом проекте:

1. **MVC (Model-View-Controller)**: Разделение приложения на модели (Entity), представления (DTO), и контроллеры (Controller) соответствует принципам архитектуры MVC.
2. **Шаблон проектирования "Repository"**: В классах репозиториев (CarRepository и ExpenseRepository) используется паттерн Repository для взаимодействия с базой данных. Он предоставляет абстракцию для доступа к данным.
3. **Шаблон проектирования "DTO" (Data Transfer Object)**: Использование объектов DTO (CarDTO, CarExpensesDTO, ExpenseDTO) для передачи данных между слоями приложения, изолируя внутреннюю структуру объектов от внешнего мира.
4. **Шаблон проектирования "Mapper"**: В проекте используется паттерн Mapper (CarMapper, ExpenseMapper), который отвечает за преобразование объектов одного типа в объекты другого типа. Это помогает избежать повторного кода и улучшить читаемость кода.

---

Выполнил Чвалов К. Р. (14 в списке журнала - **ВАРИАНТ 10**)
![1](https://github.com/KASSTUSS/vehicle-maintenance-costs-app/assets/71774684/1915403e-bf60-4644-a8c9-3fb94c5d3b4b)
![2](https://github.com/KASSTUSS/vehicle-maintenance-costs-app/assets/71774684/d58dfe62-cfef-473b-b70c-594365a8226a)
