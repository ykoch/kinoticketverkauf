package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.oberver;

import java.util.ArrayList;
import java.util.List;

public abstract class Beobachtbar
{
    private List<Beobachter> _alleBeobachter;

    protected Beobachtbar()
    {
        _alleBeobachter = new ArrayList<Beobachter>();
    }

    public void registriereBeobachter(Beobachter neuerBeobachter)
    {
        _alleBeobachter.add(neuerBeobachter);
    }
    
    public void entferneBeobachter(Beobachter entferneBeobachter)
    {
    	int observerIndex = _alleBeobachter.indexOf(entferneBeobachter);
    	_alleBeobachter.remove(observerIndex);
    }

    protected void informiereUeberAenderung(String werkzeug)
    {
        for (Beobachter beobachter : _alleBeobachter)
        {
            beobachter.reagiereAufAenderung(werkzeug);
        }
    }
}
