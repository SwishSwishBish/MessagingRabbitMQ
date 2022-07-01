# <p align=center>RabbitMQ Messaging</p>

<p align="center"><img 
    style="width: 70%;"
    src="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/images/rabbitmq.png?raw=true" 
    alt="diagram">
</img></p>

<p align="center">
<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java"/> 
<img src="https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white" alt="Gradle"/>
<img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="SpringBoot"/>
<img src="https://img.shields.io/badge/rabbitmq-%23FF6600.svg?&style=for-the-badge&logo=rabbitmq&logoColor=white" alt="RabitMQ"/>
<p>


<p align=center>
This project contains examples for using Spring-Boot with RabbitMQ. Developed to explore reliable messaging and execution capabilities. </p> 


<details close="open">
  <summary><strong>Techs</strong></summary>
    <ul>
        <li>Java</li>
    </ul>
    <ul>
        <li>Spring Boot</li>
    </ul>
    <ul>
        <li>Gradle</li>
    </ul>
    <ul>
        <li>AMQP</li>
    </ul>
    <ul>
        <li>RabbirMQ</li>
    </ul>
    <ul>
        <li>Lombok</li>
    </ul>
</details>
<details close="open">
  <summary><strong>Functionality</strong></summary>
    <ul>
        <li>Exchanges</li>
    </ul>
    <ul>
        <li>Queues</li>
    </ul>
    <ul>
        <li>Binding</li>
    </ul>
    <ul>
        <li>Routing Key</li>
    </ul>
    <ul>
        <li>Queue Arguments</li>
    </ul>
    <ul>
        <li>Message Post Processing</li>
    </ul>
    <ul>
        <li>Priority Queue</li>
    </ul>
    <ul>
        <li>Retry Mechanism</li>
    </ul>
    <ul>
        <li>Mirroring</li>
    </ul>
</details>

### <p align=center>Exchanges Types</p>

<table align="center">
	<tbody>
		<tr>
			<th align="center">Default Exchange</th>
			<td >&nbsp;<p align="center"><img 
                        style="width: 85%;"
                        src="images/default-exchange.png" 
                        alt="diagram"></img>
                    </p></td>
			<td>
				<table>
					<tbody>
						<tr align="center">
							<td>&nbsp;<a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/config/DefaultExchangeConfig.java">Configuration</a></td>
						</tr>
						<tr align="center">
							<td>&nbsp;<a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/controller/DefaultController.java">Controller</a></td>
						</tr>
					</tbody>
				</table>
				&nbsp;</td>
		</tr>
	</tbody>
	<tbody>
		<tr>
			<th align="center">Direct Exchange</th>
			<td >&nbsp;<p align="center"><img 
                        style="width: 90%;"
                        src="images/direct-exchange.png" 
                        alt="diagram"></img>
                    </p></td>
			<td>
				<table>
					<tbody>
						<tr align="center">
							<td>&nbsp;<a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/config/DirectExchangeConfig.java">Configuration</a></td>
						</tr>
						<tr align="center">
							<td>&nbsp;<a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/controller/DirectController.java">Controller</a></td>
						</tr>
					</tbody>
				</table>
				&nbsp;</td>
		</tr>
	</tbody>
<tbody>
		<tr>
			<th align="center">Fanout Exchange</th>
			<td >&nbsp;<p align="center"><img 
                        style="width: 90%;"
                        src="images/fanout-exchange.png" 
                        alt="diagram"></img>
                    </p></td>
			<td>
				<table>
					<tbody>
						<tr align="center">
							<td>&nbsp;<a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/config/FanoutExchangeConfig.java">Configuration</a></td>
						</tr>
						<tr align="center">
							<td>&nbsp;<a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/controller/FanoutController.java">Controller</a></td>
						</tr>
					</tbody>
				</table>
				&nbsp;</td>
		</tr>
	</tbody>
<tbody>
		<tr>
			<th align="center">Topic Exchange</th>
			<td >&nbsp;<p align="center"><img 
                        style="width: 90%;"
                        src="images/topic-exchange.png" 
                        alt="diagram"></img>
                    </p></td>
			<td>
				<table>
					<tbody>
						<tr align="center">
							<td>&nbsp;<a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/config/TopicExchangeConfig.java">Configuration</a></td>
						</tr>
						<tr align="center">
							<td>&nbsp;<a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/controller/TopicController.java">Controller</a></td>
						</tr>
					</tbody>
				</table>
				&nbsp;</td>
		</tr>
	</tbody>
<tbody>
		<tr>
			<th align="center">Header Exchange</th>
			<td >&nbsp;<p align="center"><img 
                        style="width: 90%;"
                        src="images/header-exchange.png" 
                        alt="diagram"></img>
                    </p></td>
			<td>
				<table>
					<tbody>
						<tr align="center">
							<td>&nbsp;<a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/config/HeaderExchangeConfig.java">Configuration</a></td>
						</tr>
						<tr align="center">
							<td>&nbsp;<a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/controller/HeaaderController.java">Controller</a></td>
						</tr>
					</tbody>
				</table>
				&nbsp;</td>
		</tr>
	</tbody>
</table>

### <p align=center>Queue Arguments</p>

<table align="center">
    <tbody>
        <tr>
            <th align="center">Time to Live / TTL</th>
            <td align="center">
                <a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/queue/TimeToLiveConfig.java">TTL Configuration</a>
            </td>
        </tr>
    </tbody>
    <tbody>
        <tr>
            <th align="center">Auto Expire</th>
            <td align="center">
                <a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/queue/AutoExpireConfig.java">Auto Expire Configuration</a>
            </td>
        </tr>
    </tbody>
    <tbody>
            <tr>
                <th align="center">Maximum Message Lenght</th>
                <td align="center">
                    <a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/queue/MaxLengthConfig.java">Maximum Message Lenght Configuration</a>
                </td>
            </tr>
        </tbody>
    <tbody>
            <tr>
                <th align="center">Maximum Message Lenght Bytes</th>
                <td align="center">
                    <a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/queue/MaxLengthByteConfig.java">Maximum Message Lenght Bytes Configuration</a>
                </td>
            </tr>
        </tbody>
    <tbody>
            <tr>
                <th align="center">Overflow</th>
                <td align="center">
                    <a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/queue/OverflowConfig.java">Overflow Configuration</a>
                </td>
            </tr>
        </tbody>
    <tbody>
            <tr>
                <th align="center">Maximum Priority</th>
                <td align="center">
                    <a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/queue/MaxPriorityConfig.java">Maximum Priority Configuration</a>
                    <br>
                    <a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/controller/MaxPriorityController.java">Maximum Priority Controller</a>
                </td>
            </tr>
        </tbody>
    <tbody>
            <tr>
                <th align="center">Lazy Mode</th>
                <td align="center">
                    <a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/queue/LazyConfig.java">Lazy Mode Configuration</a>
                </td>
            </tr>
        </tbody>
    <tbody>
            <tr>
                <th align="center">Dead Letter Exchange / DLX</th>
                <td align="center">
                    <a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/queue/DeadLetterExchangeConfig.java">Dead Letter Exchange Configuration</a>
                </td>
            </tr>
        </tbody>
        </tbody>
    <tbody>
            <tr>
                <th align="center">Dead Letter Router</th>
                <td align="center">
                    <a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/queue/DeadLetterRouterConfig.java">Dead Letter Router Configuration</a>
                </td>
            </tr>
        </tbody>
</table>

### <p align=center>Consumer</p>

<table align="center">
    <tbody>
        <tr>
            <th align="left">Manual Consumer</th>
            <td align="left">
                <a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/consumer/ManualConsumer.java">Manual Consumer</a>
                <br>
                <a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/controller/ManualConsumerController.java">Manual Consumer Controller</a>
        </td>
            </tr>
    </tbody>
    <tbody>
        <tr>
            <th align="center">Listener Consumer</th>
            <td align="center">
                <a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/consumer/ListenerConsumer.java">Listener Consumer</a>
                <br>
                <a href="https://github.com/SwishSwishBish/MessagingRabbitMQ/blob/master/src/main/java/com/sena/messagingrabbitmq/MessagingRabbitMqApplication.java">Listener Bean</a>
</td>
        </tr>
    </tbody>
</table>

## Connect with me:
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/sena-atak%C3%B6%C5%9Fker-3a79b0235/)
[![Twitter](https://img.shields.io/badge/twitter-%231DA1F2.svg?style=for-the-badge&logo=Twitter&logoColor=white)](https://twitter.com/SenaAtakosker)
[![portfolio](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:senaatakosker@gmail.com)