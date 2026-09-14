# Meu Curso

Aplicativo Android em Kotlin desenvolvido para apresentar o curso fictício de
Análise e Desenvolvimento de Sistemas do Instituto Futuro Digital.

## Requisitos atendidos

- Quatro telas construídas com XML: Home, Sobre o curso, Disciplinas e Detalhes da disciplina.
- Navegação entre telas com `Intent`, `startActivity()` e eventos de clique em Kotlin.
- Uso de `TextView`, `Button`, `ImageView`, `ScrollView`, `LinearLayout` e `GridLayout`.
- Duas imagens vetoriais diferentes em `res/drawable`.
- Seis disciplinas clicáveis organizadas em uma grade.
- Envio do nome da disciplina para uma única tela de detalhes usando `putExtra()` e `getStringExtra()`.
- Exibição de descrição, carga horária, modalidade, nível e pré-requisito para cada disciplina.
- Botões para voltar à lista de disciplinas e retornar diretamente à Home.
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
