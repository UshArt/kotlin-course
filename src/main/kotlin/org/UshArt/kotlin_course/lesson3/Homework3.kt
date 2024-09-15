package org.UshArt.kotlin_course.lesson3

val event: String "Hackathon Survival" //Название мероприятия

var date: String "" //Дата проведения

val place: String "Cafe" //Место проведения

private val eventbudget: String "" //Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы

var quantity: Int = 0 //Количество участников

var duration: Long = 15*60*60 //Длительность хакатона

private lateinit var contact: String "" //Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг

var hackathon: String "" //Текущее состояние хакатона (статус)

val sponsors: String "" //Список спонсоров

var budget: Double = 0.0 //Бюджет мероприятия

var internetAccessLevel: Int = 0 //Текущий уровень доступа к интернету

var transportation: String "" //Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки

var teams: Int = 5 //Количество команд

val tasks: String "" //Перечень задач

val lazyValue: String by lazy {
    ""
} //План эвакуации

var equipment: Int = 0
    get() = field
    set(value) {
        if (value >= 0) field = value
    } //Список доступного оборудования

var equipment: Int
    get() = field
    set(value) {
        if (value = 0) field = value
    }//Список свободного оборудования

lateinit var food: String //График питания участников (зависит от поставщика питания, определяемого за неделю до начала)

val plan: String "" //План мероприятий на случай сбоев

var experts: String "" //Список экспертов и жюри

var methods: String "" //Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью

val policy: String "" //Политика конфиденциальности

lateinit var userInfo: String //Приватные отзывы (фидбэк) участников и зрителей для анализа проблем

var temperature: Double = 25.0 //Текущая температура в помещении

var monitoring: String
    get() = field
    set(value) {
         if (value < 0) field = "bad"
         else if (value = 0) field = "normal"
         field = "High"
    } //Мониторинг и анализ производительности сетевого оборудования и интернет-соединения

var illumination: String "" //Уровень освещения

private var log: String "" //Лог событий мероприятия

val medicalСare: String "" //Доступность медицинской помощи

private val plansAndProceduresForEventSecurityIncludingEvacuationPlansAndEmergencyProtocols: String "" //Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций

val number: String "" //Регистрационный номер мероприятия

val dicebell: Int = 55 //Максимально допустимый уровень шума в помещении хакатона

var indicator: Boolean = true //Индикатор превышения уровня шума в помещениях

lateinit var formatOfTheEvent: String "" //Формат мероприятия (зависит от геополитической обстановки)

var numberOfAvailableSeats: Int = 150 //Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля

val mediaRelationsPlan: String "" //План взаимодействия с прессой

var detailedInformation: String "" //Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок

var status: String "" //Статус получения всех необходимых разрешений

val resources: String "" //Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)

var partners: String "" //Список партнеров мероприятия

lateinit var reportIncludingPhotos: String ""//Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия

val prizes: String "" //План распределения призов

val information: String "" //Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам

val limitedCapacity: String "" //Особые условия для участников с ограниченными возможностями

val mood: String by lazy {
    ""
} //Общее настроение участников (определяется опросами)

lateinit var Hackathon: String "" //Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия

lateinit val name: String "" //Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия

var people: Int
    get() = field
    set(value) {
        if (value >= 250) value = field
    } //Максимальное количество людей, которое может вместить место проведения

const val time = 2 //Стандартное количество часов, отведенное каждой команде для работы над проектом

var temperature: Int = 25 //Текущая температура в помещении