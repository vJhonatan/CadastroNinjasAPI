<h2>Visão Geral</h2>
<p>Este projeto tem como objetivo desenvolver um Sistema de Gestão de Personal Trainers para facilitar a relação entre os treinadores e seus trainees. O sistema permitirá que os treinadores gerenciem o progresso dos trainees, atribuam planos de treino, acompanhem métricas de desempenho e agendem sessões.</p>

<h2>Funcionalidades Principais</h2>
<h3>1. Gestão de Usuários</h3>
<ul>
    <li>Cadastro e gerenciamento de personal trainers.</li>
    <li>Cadastro e gerenciamento de trainees.</li>
    <li>Controle de acesso baseado em funções (Treinador, Trainee).</li>
    <li>Autenticação e autorização.</li>
</ul>

<h3>2. Gestão de Trainees</h3>
<ul>
    <li>Criação de perfil (nome, idade, email, nível de condicionamento, objetivos).</li>
    <li>Acompanhamento de progresso (peso, IMC, registros de desempenho).</li>
    <li>Histórico de treinos.</li>
</ul>

<h2>Tecnologia Utilizada</h2>
<ul>
    <li><strong>Spring Boot</strong> - Framework principal</li>
    <li><strong>Spring Data JPA</strong> - Interação com banco de dados</li>
    <li><strong>Spring Security</strong> - Autenticação e autorização</li>
    <li><strong>Flyway</strong> - Migrações de banco de dados</li>
    <li><strong>PostgreSQL</strong> - Banco de dados relacional</li>
    <li><strong>Maven</strong> - Gerenciamento de dependências</li>
    <li><strong>Docker</strong> - Containerização</li>
</ul>

<h2>Modelagem do Banco de Dados</h2>
<h3>Entidades:</h3>
<h4>1. Trainee</h4>
<ul>
    <li><code>id</code> (Long, Chave Primária)</li>
    <li><code>nome</code> (String)</li>
    <li><code>email</code> (String, Único)</li>
    <li><code>idade</code> (Integer)</li>
    <li><code>nivelCondicionamento</code> (String)</li>
    <li><code>objetivo</code> (String)</li>
</ul>

<h4>2. Personal Trainer</h4>
<ul>
    <li><code>id</code> (Long, Chave Primária)</li>
    <li><code>nome</code> (String)</li>
    <li><code>email</code> (String, Único)</li>
    <li><code>certificacoes</code> (String)</li>
    <li><code>anosExperiencia</code> (Integer)</li>
</ul>
