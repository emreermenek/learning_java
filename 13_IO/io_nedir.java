/*
    Java I/O:

    -> Java I/O, dosyalardan ve degisik kaynaklardan input almak ve dosyalara ve degisik
        kaynakşara output yazmak icin bir api olarak bilinir.
    -> Input ve Output islemleriniz hızlandırmak icin Java streamleri kullanir. Java I/O Apisinin icinde
       input, output islemleri icin onlarca sinif bulunur.

    -----------
    
    Stream nedir?

    -> Stream verilerin input ve output yoluyla Java projelerine aktigi bir veri dizisidir ve
    Javada streamler verilerin byte(1 ve 0) halinde aktigi yapilardir.
    -> Javadaki standart streamlerden bir tanesini aslinda daha once kullandik. Javada hazir
       kullanmamiz icin olusturulmus 3 tane hazir stream bulunmaktadir.
       -> System.out: Standart Output Stream
       -> System.err: Standart Error Stream
       -> System.in: Standart Input Stream

    ---------
    
    OutputStream:

    -> Java uygulamalari bir dosyaya, bir sockete ve baglanmis bir aygita veriyi Stream halinde
       yazmak(byte halinde 1 ve 0'lar ile) icin OutputStream abstract classindan(soyut sinif) 
       tureyen bir alt sinifi kullanir.
       -> write() metodu: Belli bir byte dizisini veya tek bir byte'i hedefe yazar.
       -> flush() metodu: Herhangi bir bufferlanmis veri varsa bu metod sayesinde hemen hedefe
                          yazilmasini soylemis oluruz.
       -> close() metodu: OutputStream'i kapatir.

    ---------

    InputStream:

    -> Java uygulamalari bir dosyadan, bir socketten ve baglanmis bir aygittan
       veriyi Stream halinde okumak(byte halinde 1 ve 0'lar ile) icin InputStream 
       abstract classindan(soyut sinif) tureyen bir alt sinif kullanir.
       -> read() metodu: Kaynaktan bir sonraki byte'i okur. Okuyacak herhangi bir byte yoksa 
                         -1 degeri doner.
       -> available() metodu: Okunabilecek byte sayisini doner.
       -> close() metodu: InputStream'i kapatir.
*/
