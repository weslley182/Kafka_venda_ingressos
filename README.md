<h1># Kafka Ingressos</h1>
<h2>Demonstração de utilização de Kafka com Java em um projeto de venda de ingressos</h2>

<h3>#Criar tópico</h3>
<p>kafka-topics --bootstrap-server localhost:9092 --topic <nome_topico> --create --partitions 3 --replication-factor 1</p>

<h3>#Acrescentar partições em um tópico</h3>
<p>kafka-topics --alter --bootstrap-server localhost:9092 --topic <nome_topico> --partitions <qtd></p>

<h3>#Listar tópicos</h3>
<p>kafka-topics --bootstrap-server localhost:9092 --list</p>

<h3>#Detalhes do tópico</h3>
<p>kafka-topics --bootstrap-server localhost:9092 --topic <nome_topico> --describe</p>

<h3>#Deletar tópico (Não funciona no Windows) </h3>
<p>kafka-topics --bootstrap-server localhost:9092 --topic <nome_topico> --delete</p>

<h3>#Enviar mensagem via linha de comando:</h3>
<p>kafka-console-producer --broker-list 127.0.0.1:9092 --topic <nome_topico></p>

<h3>#Consumir mensagens via linha de comando:</h3>
<p>kafka-console-consumer --bootstrap-server 127.0.0.1:9092 --topic <nome_topico></p>

<h3>#Consumir mensagens via linha de comando (desde o inicio):</h3>
<p>kafka-console-consumer --bootstrap-server 127.0.0.1:9092 --topic <nome_topico> --from-beginning</p>

<h3>#Consumir mensagens em grupo</h3>
<p>kafka-console-consumer --bootstrap-server 127.0.0.1:9092 --topic <nome_topico> --group <group-name></p>

<h3>#Mostrar grupos</h3>
<p>kafka-consumer-groups --bootstrap-server localhost:9092 --list</p>

<h3>#Visualizar status das entregas (lag) por grupo:</h3>
<p>kafka-consumer-groups --bootstrap-server localhost:9092 --describe --group <group-name></p>

<h3>#Reiniciar o offset do grupo para tópico específico</h3>
<p>kafka-consumer-groups --bootstrap-server localhost:9092 --group <group-name> --reset-offsets --to-earliest --execute --topic <nome_topico></p>

<h3>#Reiniciar o offset do grupo para todos os tópicos</h3>
<p>kafka-consumer-groups --bootstrap-server localhost:9092 --group <group-name> --reset-offsets --to-earliest --execute --all-topics</p>
