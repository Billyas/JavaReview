# Java Review

## [Java API](https://docs.oracle.com/en/java/javase/11/docs/api/)

## Basic
   1. [Char compare](./src/base/Readme.md)

   2. [regex](/src/base/regex.md)

## Collection
1. [ArrayList\<T> to \<T>[](ArrayList与数组的转换)](https://paste.ubuntu.com/p/wJTrf7Mb88/)      
   1. `int[] res = arraylist.stream().mapToInt(Integer::valueOf).toArray();`
   2. `ArrayList<Integer> int2arr =(ArrayList<Integer>) Arrays.stream(a).boxed().collect(Collectors.toList());`
   3. `String[] resstr = (String[]) arrayListString.toArray(new String[arrayListString.size()]);`
   4. `List<String> arrstr = Arrays.asList(str2arr);`

## MultiThread


## [DesignMode](/src/DesignMode/) 
1. [design mode](https://www.runoob.com/design-pattern/design-pattern-intro.html)
2. sorry, just for this Pair Extraordinaire 
3. next
