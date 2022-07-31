(demo (sin-osc))




(envelope [0 0.5 1] [1 1] :step)

(let [env (envelope [0 0.5 1] [1 1] :step)]
  (demo (sin-osc :freq (+ 200 (* 200 (env-gen env :action FREE))))))

