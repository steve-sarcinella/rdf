<h1>RDF Implementation</h1>
<h2>%DESCRIPTION</h2>
<p>%reasoning and attribution</p>

<h3>Inputs</h3>
<h4>Inital inputs from the player (or group)</h4>
<ul>
    <li>Player ID
    <li>Player name
    <li>Player level
    <li>Player server
    <li>Player item level
    <li>Player role (with option for leader
    <li>Chosen event (specific, random)
</ul>

<h4>Ongoing interaction from player or group leader</h4>
<ul>
    <li>Leave (manual leave or if new player joins the queue)
    <li>Pause (starting a scenario pauses, or manual pause)
    <li>(No change queue, only leave and requeue)
</ul>

<h4>Concerns for group</h4>
<ul>
    <li>Gather all player info
    <li>keep original group locked together
</ul>


<h3>Output</h3>
Completed group of 2..N party members (dependant on event size), 
containing 0..N tank(s), 0..N healer(s), 0..N dps, with 1 leader (optional)
notify all players (for final ready check (this can be done by scenario running system)) and output a message to be consumed by server queue that will
run the instance.  if ready check fails, return group sans unready players to top of queue.