# 関数型インタフェース

## 1. 覚えておくと便利な分類

特に重要なのは、Function・Predicate・Consumer・Supplier の4種類。

| 分類           | インタフェース         | 用途                               |
| -------------- | ---------------------- | ---------------------------------- |
| Function       | `Function<T, R>`       | 引数を受け取って値を返す           |
| BiFunction     | `BiFunction<T, U, R>`  | 2つの引数を受け取って値を返す      |
| UnaryOperator  | `UnaryOperator<T>`     | 同じ型の値を受け取って同じ型を返す |
| BinaryOperator | `BinaryOperator<T, T>` | 同じ型の2つの値から同じ型を返す    |
| Predicate      | `Predicate<T>`         | 条件判定を行う                     |
| Consumer       | `Consumer<T>`          | 値を受け取って処理する             |
| Supplier       | `Supplier<T>`          | 値を生成して返す                   |

## 2. 基本的なもの

| インタフェース名      | メソッド名          | 引数     | 戻り値    |
| --------------------- | ------------------- | -------- | --------- |
| `Function<T, R>`      | `apply(T t)`        | `T`      | `R`       |
| `BiFunction<T, U, R>` | `apply(T t, U u)`   | `T`, `U` | `R`       |
| `UnaryOperator<T>`    | `apply(T t)`        | `T`      | `T`       |
| `BinaryOperator<T>`   | `apply(T t1, T t2)` | `T, T`   | `T`       |
| `Predicate<T>`        | `test(T t)`         | `T`      | `boolean` |
| `BiPredicate<T, U>`   | `test(T t, U u)`    | `T`, `U` | `boolean` |
| `Consumer<T>`         | `accept(T t)`       | `T`      | `void`    |
| `BiConsumer<T, U>`    | `accept(T t, U u)`  | `T`, `U` | `void`    |
| `Supplier<T>`         | `get()`             | なし     | `T`       |

## 2. プリミティブ型 (int) 専用

| インタフェース名        | メソッド名                        | 引数         | 戻り値    |
| ----------------------- | --------------------------------- | ------------ | --------- |
| `IntFunction<R>`        | `apply(int value)`                | `int`        | `R`       |
| `IntToLongFunction`     | `applyAsLong(int value)`          | `int`        | `long`    |
| `IntToDoubleFunction`   | `applyAsDouble(int value)`        | `int`        | `double`  |
| `IntUnaryOperator`      | `applyAsInt(int operand)`         | `int`        | `int`     |
| `IntBinaryOperator`     | `applyAsInt(int left, int right)` | `int`, `int` | `int`     |
| `IntPredicate`          | `test(int value)`                 | `int`        | `boolean` |
| `IntConsumer`           | `accept(int value)`               | `int`        | `void`    |
| `IntSupplier`           | `getAsInt()`                      | なし         | `int`     |
| `ToIntFunction<T>`      | `applyAsInt(T value)`             | `T`          | `int`     |
| `ToIntBiFunction<T, U>` | `applyAsInt(T t, U u)`            | `T`, `U`     | `int`     |

## 3. プリミティブ型 (long) 専用

| インタフェース名         | メソッド名                           | 引数           | 戻り値    |
| ------------------------ | ------------------------------------ | -------------- | --------- |
| `LongFunction<R>`        | `apply(long value)`                  | `long`         | `R`       |
| `LongToIntFunction`      | `applyAsInt(long value)`             | `long`         | `int`     |
| `LongToDoubleFunction`   | `applyAsDouble(long value)`          | `long`         | `double`  |
| `LongUnaryOperator`      | `applyAsLong(long operand)`          | `long`         | `long`    |
| `LongBinaryOperator`     | `applyAsLong(long left, long right)` | `long`, `long` | `long`    |
| `LongPredicate`          | `test(long value)`                   | `long`         | `boolean` |
| `LongConsumer`           | `accept(long value)`                 | `long`         | `void`    |
| `LongSupplier`           | `getAsLong()`                        | なし           | `long`    |
| `ToLongFunction<T>`      | `applyAsLong(T value)`               | `T`            | `long`    |
| `ToLongBiFunction<T, U>` | `applyAsLong(T t, U u)`              | `T`, `U`       | `long`    |

## 4. プリミティブ型 (double) 専用

| インタフェース名           | メソッド名                                 | 引数               | 戻り値    |
| -------------------------- | ------------------------------------------ | ------------------ | --------- |
| `DoubleFunction<R>`        | `apply(double value)`                      | `double`           | `R`       |
| `DoubleToIntFunction`      | `applyAsInt(double value)`                 | `double`           | `int`     |
| `DoubleToLongFunction`     | `applyAsLong(double value)`                | `double`           | `long`    |
| `DoubleUnaryOperator`      | `applyAsDouble(double operand)`            | `double`           | `double`  |
| `DoubleBinaryOperator`     | `applyAsDouble(double left, double right)` | `double`, `double` | `double`  |
| `DoublePredicate`          | `test(double value)`                       | `double`           | `boolean` |
| `DoubleConsumer`           | `accept(double value)`                     | `double`           | `void`    |
| `DoubleSupplier`           | `getAsDouble()`                            | なし               | `double`  |
| `ToDoubleFunction<T>`      | `applyAsDouble(T value)`                   | `T`                | `double`  |
| `ToDoubleBiFunction<T, U>` | `applyAsDouble(T t, U u)`                  | `T`, `U`           | `double`  |

## 5. プリミティブ型と参照型の組み合わせ

| 種別            | インタフェース名       | メソッド名                  | 引数          | 戻り値 |
| --------------- | ---------------------- | --------------------------- | ------------- | ------ |
| int + 参照型    | `ObjIntConsumer<T>`    | `accept(T t, int value)`    | `T`, `int`    | `void` |
| long + 参照型   | `ObjLongConsumer<T>`   | `accept(T t, long value)`   | `T`, `long`   | `void` |
| double + 参照型 | `ObjDoubleConsumer<T>` | `accept(T t, double value)` | `T`, `double` | `void` |

## 6. 例外処理・その他

| インタフェース名 | メソッド名 | 引数 | 戻り値 |
| ---------------- | ---------- | ---- | ------ |
| `Runnable`       | `run()`    | なし | `void` |
| `Callable<V>`    | `call()`   | なし | `V`    |
