class Main {
  
  //algoritmo baseado no pseudocodigo do professor
  public static int buscaRecursiva(int dado[], int x, int inf, int sup)  {
    if(inf>sup){
      return -1;
    }
    
    int meio = (inf+sup)/2;
      
    if(x == dado[meio]){
      return meio;
    }
    
    if(x<dado[meio]){
      return buscaRecursiva(dado, x, inf, meio-1);
    }
    else{
      return buscaRecursiva(dado, x, meio+1, sup);
    }
  }
  
  public static int buscaIterativa(int dado[], int x, int inf, int sup){
    boolean finded = false;
    //a condicao de parada é ter achado o valor de x
    while(finded==false){
      int meio = (inf + sup) /2;

      if (x == dado[meio]){
        finded = true;
        return meio;
      }
      
      else if (x>dado[meio]){
        inf = meio + 1;
      }
        
      else {
        sup = meio;
      }
    }
    return -1;
    
  }
    
  public static void main(String[] args) {
    int dados[] = {12, 15, 19, 44, 88, 150};
    int resultadoRec = buscaRecursiva(dados, 12, 0, 6);
    System.out.println("Por busca recursiva do numero 12 no vetor {12, 15, 19, 44, 88, 150}, o index é: " + resultadoRec);

    int resultadoIter = buscaIterativa(dados, 44, 0, 6);
    System.out.println("Por busca iterativa do numero 44 no vetor {12, 15, 19, 44, 88, 150}, o index é: " + resultadoIter);
  }
}
