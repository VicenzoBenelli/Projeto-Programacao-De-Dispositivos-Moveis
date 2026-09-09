# Meu Curso

Aplicativo Android em Kotlin desenvolvido para apresentar o curso fictício de
Análise e Desenvolvimento de Sistemas do Instituto Futuro Digital.

## Requisitos atendidos

- Três telas construídas com XML: Home, Sobre o curso e Disciplinas.
- Navegação entre telas com `Intent`, `startActivity()` e eventos de clique em Kotlin.
- Uso de `TextView`, `Button`, `ImageView`, `ScrollView`, `LinearLayout` e `GridLayout`.
- Duas imagens vetoriais diferentes em `res/drawable`.
- Seis disciplinas organizadas em uma grade.
- Layouts visualmente diferentes para Home e Sobre o curso.

## Como executar

1. Abra esta pasta no Android Studio.
2. Aguarde a sincronização do Gradle.
3. Selecione um emulador ou dispositivo Android com API 24 ou superior.
4. Execute o módulo `app`.

Para apenas compilar no terminal do Windows:

```powershell
.\gradlew.bat assembleDebug
```

O APK de desenvolvimento será gerado em `app/build/outputs/apk/debug/`.
