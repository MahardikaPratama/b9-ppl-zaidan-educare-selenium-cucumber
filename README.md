# b9-ppl-zaidan-educare-selenium-cucumber

Proyek ini merupakan automation testing untuk aplikasi Pengelolaan Dana Pendidikan Sekolah Zaidan Educare menggunakan Selenium, Cucumber, dan TestNG. Struktur direktori berikut menjelaskan pembagian file dan fungsinya:

```
b9-ppl-zaidan-educare-selenium-cucumber
├─ .mvn                             # Konfigurasi Maven Wrapper
│  └─ wrapper
│     └─ maven-wrapper.properties
├─ mvnw, mvnw.cmd                   # Script Maven Wrapper (Linux/Windows)
├─ pom.xml                          # Konfigurasi utama Maven (dependensi, plugin, dsb)
├─ src
│  ├─ main
│  │  ├─ java
│  │  │  └─ com
│  │  │     └─ zaidan
│  │  │        └─ testng
│  │  │           ├─ actions                        # Kelas aksi untuk interaksi halaman (Page Actions)
│  │  │           │  ├─ HomePageActions.java
│  │  │           │  ├─ LoginPageActions.java
│  │  │           │  └─ LogoutActions.java
│  │  │           ├─ locators                       # Kelas locator untuk mendefinisikan elemen web
│  │  │           │  ├─ HomePageLocators.java
│  │  │           │  ├─ LoginPageLocators.java
│  │  │           │  └─ LogoutLocators.java
│  │  │           └─ utils                          # Kelas utilitas (setup WebDriver)
│  │  │              └─ HelperClass.java
│  │  └─ resources
│  │     └─ application.properties                  # Konfigurasi aplikasi (jika diperlukan)
│  └─ test
│     ├─ java
│     │  └─ com
│     │     └─ zaidan
│     │        └─ testng
│     │           ├─ definitions                    # Step definition untuk Cucumber/TestNG
│     │           │  ├─ Hooks.java
│     │           │  ├─ LoginPageDefinitions.java
│     │           │  └─ LogoutDefinitions.java
│     │           └─ runner                         # Runner untuk menjalankan test suite
│     │              └─ CucumberRunnerTests.java
│     └─ resources
│        └─ features                                # File feature Cucumber (Gherkin)
│           ├─ LoginPage.feature
│           └─ Logout.feature
├─ target                           # Hasil build Maven, laporan pengujian, dan file sementara
├─ test-output                      # Output dan laporan hasil pengujian TestNG
└─ testng.xml                       # Konfigurasi suite TestNG

```