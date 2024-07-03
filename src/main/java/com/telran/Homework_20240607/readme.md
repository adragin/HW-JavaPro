## Техническое задание

Создать приложение, которое включает следующие функции:

1. Вычисление площади круга по радиусу.
2. Вычисление площади треугольника по трём сторонам.

### Дополнительные требования:

1. Легкость добавления других фигур.
    - Библиотека должна быть спроектирована так, чтобы добавление новых типов фигур требовало минимальных изменений в существующем коде.

2. Вычисление площади фигуры без знания типа фигуры на этапе компиляции (compile-time).
    - Должен быть реализован механизм, который позволяет вычислять площадь любой фигуры, не зная ее тип на этапе компиляции.

3. Проверка на то, является ли треугольник прямоугольным.
    - Необходимо реализовать метод, который проверяет, является ли треугольник прямоугольным.

## Ожидаемый результат

Библиотека должна содержать:

1. Интерфейсы и базовые классы для фигур.
2. Реализации для круга и треугольника.
3. Методы для вычисления площади и проверки на прямоугольность треугольника.

## Примерная структура классов

![](https://www.plantuml.com/plantuml/png/ZL5DZzCm4BtxLunw8O2ISexGQaCvBXBQ8kxJP4WiERQndIu8-Eyu7fbuYK3jfV4Rp_jullS1NLXc9LvC8LZV7ezMeLwHfZVpiLVeVJr871tEGk351uTzW8J3UK9BFmJ4tv_9IA5pXDNB5WQpN1I9NqBmzPDqlIA-NpiSvEBpfOIz_i_k-Uk2BkzwET3Dcv-SH3sgShShbnbwjuTEpoMaVvJZ55Q9Yp6AK6VyFOsaoM6WOhZpTJLos5mzKX-IBQ1lWVIGosJv9pc42PvRccYLlo4srmnr_VEEIGMNLoAvb18JKWToNx0d-2pfYQsCb1AVWvDwJ8XryLx50Cn-t4Kx6UrZ1Hk7xr53v8X_iIPsddWX4pDMCg-pJ5iGGjD4l-jNLljW1bAiyo1zU9kotCNjpZdyla9CZjR6cgiqpkI5x0FwlQ5W-BGriANywCZJMXYmU3r3osRuU8MMVPRg_nJUuvrILLb2Ib_NPXCMIUqlJAI0S7ZJDAyEQNOmcWxiB7llh6NJrvMqBLyimNCYBkFOA03jfiD6tQ9BZ-LBiTSejBbCf_jOmpAhtm00)
