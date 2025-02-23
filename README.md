# SuperApp Android

Bem-vindo ao repositório do **SuperApp Android**! Este projeto visa desenvolver um superapp completo e escalável, aproveitando as melhores práticas e tecnologias da plataforma Android. O foco está na modularidade, performance e facilidade de manutenção.

## 🚀 Tecnologias e Bibliotecas

Até o momento, foram integradas as seguintes bibliotecas e ferramentas essenciais ao projeto:

- **[Hilt](https://developer.android.com/training/dependency-injection/hilt-android)**: Injeção de dependências facilitando a modularização e tornando o código mais testável e organizado.
- **[SplashScreen](https://developer.android.com/reference/android/os/SplashScreen)**: Gerenciamento eficiente da tela de splash, seguindo as melhores práticas da Google.
- **[Coil](https://coil-kt.github.io/coil/)**: Biblioteca para carregamento de imagens via URLs de forma simples, eficiente e com baixo consumo de memória.

## 🛠️ Módulo Utilities

Como parte da estrutura modular do aplicativo, foi criado o módulo **utilities**, que tem como objetivo centralizar funções e recursos comuns que podem ser reutilizados por outros módulos. Até o momento, ele está sendo utilizado para o controle dos **logs de depuração**, garantindo que apenas no build `DEBUG` as mensagens de log sejam exibidas.

**Exemplo de uso para controle de logs de depuração**:

```kotlin

object AppLogger {

    private const val TAG = "AppLogger"

    fun d(tag: String = TAG, message: String) {
        if (BuildConfig.DEBUG) {
            Log.d(tag, message)
        }
    }

    fun e(tag: String = TAG, message: String) {
        if (BuildConfig.DEBUG) {
            Log.e(tag, message)
        }
    }
}

```
Isso permite que os logs apareçam somente em builds de desenvolvimento e sejam omitidos em builds de produção.


## 🔧 Como Rodar o Projeto

Para rodar o projeto localmente, siga os seguintes passos:

1. Clone este repositório para sua máquina local:

    ```bash
    
   git clone https://github.com/pedroabreudev/SuperApp.git
    
    ```

2. Abra o projeto no Android Studio.
3. Compile e execute o aplicativo em um dispositivo ou emulador Android.

     
## 🧑‍💻 Jornada de Desenvolvimento

O desenvolvimento deste superapp tem sido uma jornada de aprendizado e crescimento contínuos. Até o momento, a estrutura do projeto está sendo construída com foco em escalabilidade e manutenibilidade, utilizando as melhores práticas do ecossistema Android.

### O que já foi feito:
- Implementação do Hilt para injeção de dependências.
- Adição do SplashScreen para melhorar a experiência de inicialização.
- Integração da biblioteca Coil para carregamento de imagens via URL.
- Criação do módulo `utilities` para centralizar funções comuns, como o controle de logs.

### Próximos Passos:
- Expansão das funcionalidades do superapp, incluindo navegação, gerenciamento de estado e integração com APIs.
- Refinamento da UI/UX para uma melhor experiência do usuário.
- Testes e melhorias na performance do app.

## 📝 Contribuições

Este projeto está em constante evolução! Se você quiser contribuir, fique à vontade para abrir uma **pull request** com melhorias, correções ou novas funcionalidades.

## 📄 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

