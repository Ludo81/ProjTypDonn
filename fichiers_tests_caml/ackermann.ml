
let rec succ = fun n -> n + 1 
	and iter = fun f -> fun n -> if n = 0 then (f 1) else f (iter f (n - 1))
		and  ack = fun m -> if m = 0 then succ else iter (ack (m - 1))
			in ack 3 2;;