

*CONFIG

-bind queue to exchange with routing key 
-use Object to JSON converter 


*CONSUMER 

-@RabbitListener(queue.name) 
-consume(msg) -> will grab msg 


*PRODUCER

-sendMsg(msg) {
RabbitTemplate.convertAndSend(exchange, routingKey, msg) }



*CONTROLLER

-sendMesg(@RequestParam("message") msg) 
producer.sendMsg(msg) 







