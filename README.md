# Aplicativo de Cadastro de Usuários

Este é um projeto Android desenvolvido como parte das atividades do 5º semestre do curso de ADS. O aplicativo permite o cadastro simples de usuários (nome e e-mail) e a visualização desses dados em uma lista.

## 🚀 Funcionalidades

- **Cadastro de Usuários**: Interface para inserir nome completo e e-mail.
- **Lista de Usuários**: Exibição dos usuários cadastrados utilizando `RecyclerView`.
- **Interface Moderna**: Implementação de `Edge-to-Edge` para aproveitar toda a tela do dispositivo.

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Java
- **Android SDK**: Componentes modernos como `AppCompatActivity`, `RecyclerView` e `Material Components`.
- **Layouts**: XML com `ConstraintLayout`.

## 📂 Estrutura do Projeto

O projeto está organizado nas seguintes classes principais:

- `MainActivity`: Tela principal que contém a lista de usuários e o botão para navegar até a tela de cadastro.
- `CreateUser`: Atividade responsável por capturar os dados do novo usuário e salvá-los.
- `UserAdapter`: Adaptador para gerenciar a exibição dos itens na `RecyclerView`.

## 🗓️ Atualizações de hoje (26/03/2026)

- Implementação do `UserAdapter` para exibir os usuários na lista.
- Consolidação do fluxo de cadastro e retorno para atualização da `RecyclerView` na `MainActivity`.


## ⚙️ Como executar

1. Clone este repositório.
2. Abra o projeto no **Android Studio**.
3. Sincronize o Gradle.
4. Execute em um emulador ou dispositivo físico com Android 7.0 (API 24) ou superior.

---
*Desenvolvido como projeto acadêmico.*
