# JavaExperiments
浙江工业大学2024级地理信息学院Java上机实验
## Java 上机实验 5

## 1. 接口编程

按以下要求编程：

### (1) 编写两个接口 `Shape` 和 `Knowledge`：
- `Shape` 定义两个方法 `area()` 和 `perimeter()`（分别返回该形状的面积和周长）；
- `Knowledge` 定义两个方法 `areaFormula()` 和 `perimeterFormula()`（分别返回该形状的面积计算公式和周长计算公式的语言描述）。

### (2) 编写两个类 `Rectangle` 和 `Triangle`（矩形和三角形）：
- 两个类均要实现上述两个接口，并编写相应的方法的实现代码。

### (3) 编写两个类 `Square` 和 `EquilateralTriangle`（正方形和等边三角形）：
- `Square` 继承 `Rectangle`，并重写上述 4 个方法；
- `EquilateralTriangle` 继承 `Triangle`，并重写上述 4 个方法。

## 2. 一维数组编程

现有两个 double 类型的数组如下：
```java
double xs[] = {1, 9, 3, 5, 6};
double ys[] = {10, 11, 4, 7, 13};
```
又有一个矩形的数组如下（实现采用上一题的）：
```java
Rectangle rects[] = new Rectangle[10];
```
要求：
1. 构造 5 个矩形的实例，并放入数组 `rects`（构造时候的长和宽分别为 `xs` 和 `ys` 对应位置的元素）；
2. 按面积由小到大对这 5 个矩形实例进行排序。
> 说明：不知道大家数据结构的排序有没有学，如果没有学第(2)条就忽略。

## 3. 二维数组编程

编写一个矩阵类 `MyMatrix`，要求：
1. 构造的时候用户可以指定矩阵的行数和列数；
2. 矩阵的每个元素随机生成，并采用二维数组保存数据；
3. 编写一个方法 `maxNum`，返回二维数组中最大的元素。
> 提示：生成随机数据的代码如下：
```java
import java.util.Random;
Random rand = new Random();
int randomNumber = rand.nextInt();
```

