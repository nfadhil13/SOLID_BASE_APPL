<h2>Stream Progress</h2>

Dalam memperbaiki program tersebut kita menerapkan sebuah Interface.Interface tersebut berfungsi agar mempermudah kita ketika kita ingin menambah jenis Stream Baru.Contoh saat kita menambah file music dengan menambah class Music , kita tidak perlu mengubah class StreamProgressInfo.

Prinsip penambahan interface tersebut termasuk kedalam <b>Open/Closed Principle</b>.Yaitu sebuah program harus <b>"open"</b> pada sebuah penambahan(extension) tetapi <b>"close"</b> terhadap modifikasi.Misal ketika sebuah class ditulis oleh developer 1, dan developer 2 ingin menggunakan kelas tersebut tapi dengan sedikit modifikasi, maka developer 2 tidak perlu mengubah class tersebut cukup melakukan extends class tersebut.
