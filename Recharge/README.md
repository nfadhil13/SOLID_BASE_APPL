<h2> Recharge </h2>

Pada bagian ini awalnya Worker mengImplement ISleeper,karena hal tersebut Robot yang melakukan Extend terhadap worker harus juga mengimplement ISleeper, sedangkan Robot sebenarnya tidak perlu mengimpelement Interface ISleeper (karena robot tidak memerlukan method sleep).Hal ini melanggar prinsip SOLID yaitu <b>Interface Segregation Principle</b> dimana class Robot mengimplement method yang tidak ia perlukan.

Untuk mengatasi hal tersebut pada abstract class worker kita menghapus implemet pada interface ISleeper.Lalu pada class Employee kita menambahkan implement ISleeper (karena class Employee memerlukan method sleep yang awalnya di implemet dari extend pada class Worker).Setelah langkah-langkah tersebut dilakukan maka dengan otomatis class Robot tidak lagi mengimplementasi interface ISleeper.
