import { Component, OnInit } from '@angular/core';
import { Incidencia } from '../model/incidencia';
import { Regiao } from '../model/regiao';
import { Faixaetaria } from '../model/faixaetaria';
import { RegiaoService } from '../service/regiao.service';
import { IncidenciaService } from '../service/incidencia.service';
import { FaixaetariaService } from '../service/faixa-etaria.service';

@Component({
  selector: 'app-exames',
  templateUrl: './exames.component.html',
  styleUrls: ['./exames.component.css']
})
export class ExamesComponent implements OnInit {

  incidencia_exame: Incidencia[] = [];
  regioes: Regiao[] = [];
  faixasetarias: Faixaetaria[] = [];
  panelOpenState: boolean = false;

  constructor(
    private regiaoService: RegiaoService,
    private incidenciaService: IncidenciaService,
    private faixaEtariaService: FaixaetariaService
  ) { }

  ngOnInit(): void {
    this.incidenciaService.listaIncidencias().subscribe(
      incidencia_exame => { this.incidencia_exame = incidencia_exame });
    this.regiaoService.listRegioes().subscribe(regioes => { this.regioes = regioes });
    this.faixaEtariaService.listFaixaEtaria().subscribe
      (faixasetarias => { this.faixasetarias = faixasetarias });
  }

}
