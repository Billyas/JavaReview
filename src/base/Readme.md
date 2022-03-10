# Java 基本类型知识

## Java 中的比较字符是否相等的方法

[Java](https://www.delftstack.com/zh/tags/java/) [Java char](https://www.delftstack.com/zh/tags/java-char/)

创建时间: November-18, 2021



1. [在 Java 中使用 `==` 相等运算符检查相等字符](https://www.delftstack.com/zh/howto/java/java-char-equals-in-java/#%E5%9C%A8-java-%E4%B8%AD%E4%BD%BF%E7%94%A8-%E7%9B%B8%E7%AD%89%E8%BF%90%E7%AE%97%E7%AC%A6%E6%A3%80%E6%9F%A5%E7%9B%B8%E7%AD%89%E5%AD%97%E7%AC%A6)
   1. [使用 Java 中的 `equals()` 方法检查相等的字符](https://www.delftstack.com/zh/howto/java/java-char-equals-in-java/#%E4%BD%BF%E7%94%A8-java-%E4%B8%AD%E7%9A%84-equals-%E6%96%B9%E6%B3%95%E6%A3%80%E6%9F%A5%E7%9B%B8%E7%AD%89%E7%9A%84%E5%AD%97%E7%AC%A6)
   2. [使用 Java 中的 `compare()` 方法检查相等的字符](https://www.delftstack.com/zh/howto/java/java-char-equals-in-java/#%E4%BD%BF%E7%94%A8-java-%E4%B8%AD%E7%9A%84-compare-%E6%96%B9%E6%B3%95%E6%A3%80%E6%9F%A5%E7%9B%B8%E7%AD%89%E7%9A%84%E5%AD%97%E7%AC%A6)

本教程介绍如何在 Java 中检查两个字符是否相等。

在 Java 中，我们可以使用 equals(`==`) 运算符或 `Character` 类的 `equals()` 方法来比较两个字符。如果你使用原始字符值，你可以简单地使用 `==` 相等运算符，但使用字符类实例，使用 `equals()` 方法。

在本文中，我们将通过示例学习这两种比较相等方法的使用。让我们开始吧。

## [在 Java 中使用 `==` 相等运算符检查相等字符](https://www.delftstack.com/zh/howto/java/java-char-equals-in-java/#在-java-中使用-相等运算符检查相等字符)

Java 使用 `==` 相等运算符来检查两个值是否相等。我们可以使用这个运算符来检查两个字符是否相等。

在这个例子中，我们创建了三个字符并使用 == 等于运算符比较它们。如果两个字符相等，则此运算符返回 true，否则返回 false。

```java
public class SimpleTesting{
	public static void main(String[] args){
		char ch1 = 'J';
		char ch2 = 'K';
		char ch3 = 'J';
		System.out.println(ch1 == ch2);
		System.out.println(ch2 == ch3);
		System.out.println(ch1 == ch3);
	}
}
```

输出：

```text
false
false
true
```

## [使用 Java 中的 `equals()` 方法检查相等的字符](https://www.delftstack.com/zh/howto/java/java-char-equals-in-java/#使用-java-中的-equals-方法检查相等的字符)

如果你正在使用 `Character` 类并想要比较两个字符值，则使用属于 `Object` 类的 `equals()` 方法，如果对象相等则返回 true，否则返回 false。请参阅下面的示例。

```java
public class SimpleTesting{
	public static void main(String[] args){
		Character ch1 = 'J';
		Character ch2 = 'K';
		Character ch3 = 'J';
		System.out.println(ch1.equals(ch2));
		System.out.println(ch2.equals(ch3));
		System.out.println(ch1.equals(ch3));
	}
}
```

输出：

```text
false
false
true
```

## [使用 Java 中的 `compare()` 方法检查相等的字符](https://www.delftstack.com/zh/howto/java/java-char-equals-in-java/#使用-java-中的-compare-方法检查相等的字符)

这是另一种可用于检查两个字符是否相等的解决方案。`compare()` 方法属于 `String` 类，如果两个值相等，则返回 0。

在这里，我们使用此方法和 `==` 等于运算符来验证它是否返回 0。如果它返回 0，则两个值相等。请参阅下面的示例。

```java
public class SimpleTesting{
	public static void main(String[] args){
		Character ch1 = 'J';
		Character ch2 = 'K';
		Character ch3 = 'J';
		System.out.println(Character.compare(ch1,ch2)==0);
		System.out.println(Character.compare(ch2,ch3)==0);
		System.out.println(Character.compare(ch1,ch3)==0);
	}
}
```

输出：

```text
false
false
true
```

在检查两个对象的相等性时，请始终检查值。Java 不认为小写和大写相等。我们认为这两个值是相同的，但是 Java 对 Unicode 值起作用，并且两个变量持有不同的 Unicode。这就是 Java 向控制台返回 false 的原因。请参阅代码示例并了解 Java 对小写和大写字符的处理方式不同。

```java
public class SimpleTesting{
	public static void main(String[] args){
		Character ch1 = 'J';
		Character ch2 = 'j'; 
		System.out.println(ch1 == ch2);
	}
}
```

输出：

```text
false
```
